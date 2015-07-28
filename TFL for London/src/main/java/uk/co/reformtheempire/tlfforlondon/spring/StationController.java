package uk.co.reformtheempire.tlfforlondon.spring;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uk.co.reformtheempire.tlfforlondon.reader.Parser;
import uk.co.reformtheempire.tlfforlondon.xml.objects.Station;

@RestController
public class StationController {
	
	@RequestMapping("/station")
    public ArrayList<Station> arrayList(@RequestParam(value="name", defaultValue="River Street , Clerkenwell") String name) {
		final long startTime = System.nanoTime();
        final Parser p = new Parser();
        final ArrayList<Station> stations = p.parse();
		final long endTime = System.nanoTime();
		System.out.println("TIME TAKEN: " + (endTime - startTime) / 1000000);
        return stations;
    }
}
