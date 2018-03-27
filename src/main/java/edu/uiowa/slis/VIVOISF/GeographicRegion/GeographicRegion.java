package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class GeographicRegion extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegion currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegion.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			GeographicRegionIterator theGeographicRegionIterator = (GeographicRegionIterator) findAncestorWithClass(this, GeographicRegionIterator.class);

			if (theGeographicRegionIterator != null) {
				subjectURI = theGeographicRegionIterator.getSubjectURI();
				label = theGeographicRegionIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001025Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001025Iterator)this.getParent()).getRO_0001025();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001025Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001025Iterator)this.getParent()).getRO_0001025();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001025Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001025Iterator)this.getParent()).getRO_0001025();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001025Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001025Iterator)this.getParent()).getRO_0001025();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Agent.AgentRO_0001025Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Agent.AgentRO_0001025Iterator)this.getParent()).getRO_0001025();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonRO_0001025Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonRO_0001025Iterator)this.getParent()).getRO_0001025();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001GeographicFocusIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001GeographicFocusIterator)this.getParent()).getGeographicFocus();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002GeographicFocusIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002GeographicFocusIterator)this.getParent()).getGeographicFocus();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004GeographicFocusIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004GeographicFocusIterator)this.getParent()).getGeographicFocus();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingGeographicFocusIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingGeographicFocusIterator)this.getParent()).getGeographicFocus();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Agent.AgentGeographicFocusIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Agent.AgentGeographicFocusIterator)this.getParent()).getGeographicFocus();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonGeographicFocusIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonGeographicFocusIterator)this.getParent()).getGeographicFocus();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Area.AreaBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Area.AreaBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Self_governing.Self_governingBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Self_governing.Self_governingBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Territory.TerritoryBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Territory.TerritoryBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000051Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000051Iterator)this.getParent()).getBFO_0000051();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.StateOrProvince.StateOrProvinceBFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.StateOrProvince.StateOrProvinceBFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000050Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000050Iterator)this.getParent()).getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001025Iterator theBFO_0000001RO_0001025Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001025Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001025Iterator.class);

			if (subjectURI == null && theBFO_0000001RO_0001025Iterator != null) {
				subjectURI = theBFO_0000001RO_0001025Iterator.getRO_0001025();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001025Iterator theBFO_0000002RO_0001025Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001025Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001025Iterator.class);

			if (subjectURI == null && theBFO_0000002RO_0001025Iterator != null) {
				subjectURI = theBFO_0000002RO_0001025Iterator.getRO_0001025();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001025Iterator theBFO_0000004RO_0001025Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001025Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001025Iterator.class);

			if (subjectURI == null && theBFO_0000004RO_0001025Iterator != null) {
				subjectURI = theBFO_0000004RO_0001025Iterator.getRO_0001025();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001025Iterator theThingRO_0001025Iterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001025Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001025Iterator.class);

			if (subjectURI == null && theThingRO_0001025Iterator != null) {
				subjectURI = theThingRO_0001025Iterator.getRO_0001025();
			}

			edu.uiowa.slis.VIVOISF.Agent.AgentRO_0001025Iterator theAgentRO_0001025Iterator = (edu.uiowa.slis.VIVOISF.Agent.AgentRO_0001025Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Agent.AgentRO_0001025Iterator.class);

			if (subjectURI == null && theAgentRO_0001025Iterator != null) {
				subjectURI = theAgentRO_0001025Iterator.getRO_0001025();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonRO_0001025Iterator thePersonRO_0001025Iterator = (edu.uiowa.slis.VIVOISF.Person.PersonRO_0001025Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonRO_0001025Iterator.class);

			if (subjectURI == null && thePersonRO_0001025Iterator != null) {
				subjectURI = thePersonRO_0001025Iterator.getRO_0001025();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001GeographicFocusIterator theBFO_0000001GeographicFocusIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001GeographicFocusIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001GeographicFocusIterator.class);

			if (subjectURI == null && theBFO_0000001GeographicFocusIterator != null) {
				subjectURI = theBFO_0000001GeographicFocusIterator.getGeographicFocus();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002GeographicFocusIterator theBFO_0000002GeographicFocusIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002GeographicFocusIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002GeographicFocusIterator.class);

			if (subjectURI == null && theBFO_0000002GeographicFocusIterator != null) {
				subjectURI = theBFO_0000002GeographicFocusIterator.getGeographicFocus();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004GeographicFocusIterator theBFO_0000004GeographicFocusIterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004GeographicFocusIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004GeographicFocusIterator.class);

			if (subjectURI == null && theBFO_0000004GeographicFocusIterator != null) {
				subjectURI = theBFO_0000004GeographicFocusIterator.getGeographicFocus();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingGeographicFocusIterator theThingGeographicFocusIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingGeographicFocusIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingGeographicFocusIterator.class);

			if (subjectURI == null && theThingGeographicFocusIterator != null) {
				subjectURI = theThingGeographicFocusIterator.getGeographicFocus();
			}

			edu.uiowa.slis.VIVOISF.Agent.AgentGeographicFocusIterator theAgentGeographicFocusIterator = (edu.uiowa.slis.VIVOISF.Agent.AgentGeographicFocusIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Agent.AgentGeographicFocusIterator.class);

			if (subjectURI == null && theAgentGeographicFocusIterator != null) {
				subjectURI = theAgentGeographicFocusIterator.getGeographicFocus();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonGeographicFocusIterator thePersonGeographicFocusIterator = (edu.uiowa.slis.VIVOISF.Person.PersonGeographicFocusIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonGeographicFocusIterator.class);

			if (subjectURI == null && thePersonGeographicFocusIterator != null) {
				subjectURI = thePersonGeographicFocusIterator.getGeographicFocus();
			}

			edu.uiowa.slis.VIVOISF.Area.AreaBFO_0000051Iterator theAreaBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Area.AreaBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Area.AreaBFO_0000051Iterator.class);

			if (subjectURI == null && theAreaBFO_0000051Iterator != null) {
				subjectURI = theAreaBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.Self_governing.Self_governingBFO_0000051Iterator theSelf_governingBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Self_governing.Self_governingBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Self_governing.Self_governingBFO_0000051Iterator.class);

			if (subjectURI == null && theSelf_governingBFO_0000051Iterator != null) {
				subjectURI = theSelf_governingBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.Territory.TerritoryBFO_0000051Iterator theTerritoryBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Territory.TerritoryBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Territory.TerritoryBFO_0000051Iterator.class);

			if (subjectURI == null && theTerritoryBFO_0000051Iterator != null) {
				subjectURI = theTerritoryBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000051Iterator theBFO_0000001BFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000051Iterator.class);

			if (subjectURI == null && theBFO_0000001BFO_0000051Iterator != null) {
				subjectURI = theBFO_0000001BFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000051Iterator theBFO_0000002BFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000051Iterator.class);

			if (subjectURI == null && theBFO_0000002BFO_0000051Iterator != null) {
				subjectURI = theBFO_0000002BFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000051Iterator theBFO_0000004BFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000051Iterator.class);

			if (subjectURI == null && theBFO_0000004BFO_0000051Iterator != null) {
				subjectURI = theBFO_0000004BFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000051Iterator theBFO_0000006BFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000051Iterator.class);

			if (subjectURI == null && theBFO_0000006BFO_0000051Iterator != null) {
				subjectURI = theBFO_0000006BFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000051Iterator theBFO_0000141BFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000051Iterator.class);

			if (subjectURI == null && theBFO_0000141BFO_0000051Iterator != null) {
				subjectURI = theBFO_0000141BFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator theCountryBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Country.CountryBFO_0000051Iterator.class);

			if (subjectURI == null && theCountryBFO_0000051Iterator != null) {
				subjectURI = theCountryBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000051Iterator theGeographicLocationBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000051Iterator.class);

			if (subjectURI == null && theGeographicLocationBFO_0000051Iterator != null) {
				subjectURI = theGeographicLocationBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000051Iterator theGeographicRegionBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000051Iterator.class);

			if (subjectURI == null && theGeographicRegionBFO_0000051Iterator != null) {
				subjectURI = theGeographicRegionBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000051Iterator theGeopoliticalEntityBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000051Iterator.class);

			if (subjectURI == null && theGeopoliticalEntityBFO_0000051Iterator != null) {
				subjectURI = theGeopoliticalEntityBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000051Iterator theLocationBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000051Iterator.class);

			if (subjectURI == null && theLocationBFO_0000051Iterator != null) {
				subjectURI = theLocationBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000051Iterator theThingBFO_0000051Iterator = (edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000051Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000051Iterator.class);

			if (subjectURI == null && theThingBFO_0000051Iterator != null) {
				subjectURI = theThingBFO_0000051Iterator.getBFO_0000051();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000050Iterator theBFO_0000001BFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001BFO_0000050Iterator.class);

			if (subjectURI == null && theBFO_0000001BFO_0000050Iterator != null) {
				subjectURI = theBFO_0000001BFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000050Iterator theBFO_0000002BFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002BFO_0000050Iterator.class);

			if (subjectURI == null && theBFO_0000002BFO_0000050Iterator != null) {
				subjectURI = theBFO_0000002BFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000050Iterator theBFO_0000004BFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004BFO_0000050Iterator.class);

			if (subjectURI == null && theBFO_0000004BFO_0000050Iterator != null) {
				subjectURI = theBFO_0000004BFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000050Iterator theBFO_0000006BFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006BFO_0000050Iterator.class);

			if (subjectURI == null && theBFO_0000006BFO_0000050Iterator != null) {
				subjectURI = theBFO_0000006BFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000050Iterator theBFO_0000141BFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141BFO_0000050Iterator.class);

			if (subjectURI == null && theBFO_0000141BFO_0000050Iterator != null) {
				subjectURI = theBFO_0000141BFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000050Iterator theGeographicLocationBFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationBFO_0000050Iterator.class);

			if (subjectURI == null && theGeographicLocationBFO_0000050Iterator != null) {
				subjectURI = theGeographicLocationBFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000050Iterator theGeographicRegionBFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionBFO_0000050Iterator.class);

			if (subjectURI == null && theGeographicRegionBFO_0000050Iterator != null) {
				subjectURI = theGeographicRegionBFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000050Iterator theGeopoliticalEntityBFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityBFO_0000050Iterator.class);

			if (subjectURI == null && theGeopoliticalEntityBFO_0000050Iterator != null) {
				subjectURI = theGeopoliticalEntityBFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000050Iterator theLocationBFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Location.LocationBFO_0000050Iterator.class);

			if (subjectURI == null && theLocationBFO_0000050Iterator != null) {
				subjectURI = theLocationBFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.StateOrProvince.StateOrProvinceBFO_0000050Iterator theStateOrProvinceBFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.StateOrProvince.StateOrProvinceBFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.StateOrProvince.StateOrProvinceBFO_0000050Iterator.class);

			if (subjectURI == null && theStateOrProvinceBFO_0000050Iterator != null) {
				subjectURI = theStateOrProvinceBFO_0000050Iterator.getBFO_0000050();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000050Iterator theThingBFO_0000050Iterator = (edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000050Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingBFO_0000050Iterator.class);

			if (subjectURI == null && theThingBFO_0000050Iterator != null) {
				subjectURI = theThingBFO_0000050Iterator.getBFO_0000050();
			}

			if (theGeographicRegionIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?labelUS") == null ? null : sol.get("?labelUS").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelENG") == null ? null : sol.get("?labelENG").asLiteral().getString();
					if (label == null)
						label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelANY") == null ? null : sol.get("?labelANY").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in GeographicRegion doStartTag", e);
			throw new JspTagException("Exception raised in GeographicRegion doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in GeographicRegion doEndTag", e);
			throw new JspTagException("Exception raised in GeographicRegion doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String theSubjectURI) {
		subjectURI = theSubjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String theLabel) {
		label = theLabel;
	}

	public String getLabel() {
		return label;
	}

}
