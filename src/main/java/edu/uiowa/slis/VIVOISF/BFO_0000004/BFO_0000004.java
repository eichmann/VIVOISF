package edu.uiowa.slis.VIVOISF.BFO_0000004;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class BFO_0000004 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000004 currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000004.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String abbreviation = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			BFO_0000004Iterator theBFO_0000004Iterator = (BFO_0000004Iterator) findAncestorWithClass(this, BFO_0000004Iterator.class);

			if (theBFO_0000004Iterator != null) {
				subjectURI = theBFO_0000004Iterator.getSubjectURI();
				label = theBFO_0000004Iterator.getLabel();
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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator)this.getParent()).getARG_2000029();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingResearchAreaOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingResearchAreaOfIterator)this.getParent()).getResearchAreaOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Concept.ConceptResearchAreaOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Concept.ConceptResearchAreaOfIterator)this.getParent()).getResearchAreaOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Area.AreaRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Area.AreaRO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Self_governing.Self_governingRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Self_governing.Self_governingRO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Territory.TerritoryRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Territory.TerritoryRO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006RO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006RO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141RO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141RO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Country.CountryRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Country.CountryRO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationRO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionRO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityRO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Location.LocationRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Location.LocationRO_0001015Iterator)this.getParent()).getRO_0001015();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001015Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001015Iterator)this.getParent()).getRO_0001015();
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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionGeographicFocusOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionGeographicFocusOfIterator)this.getParent()).getGeographicFocusOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RO_0000052Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RO_0000052Iterator)this.getParent()).getRO_0000052();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Name.NameRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Name.NameRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator)this.getParent()).getRelates();
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

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator theARG_2000379ARG_2000029Iterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator.class);

			if (subjectURI == null && theARG_2000379ARG_2000029Iterator != null) {
				subjectURI = theARG_2000379ARG_2000029Iterator.getARG_2000029();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingResearchAreaOfIterator theThingResearchAreaOfIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingResearchAreaOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingResearchAreaOfIterator.class);

			if (subjectURI == null && theThingResearchAreaOfIterator != null) {
				subjectURI = theThingResearchAreaOfIterator.getResearchAreaOf();
			}

			edu.uiowa.slis.VIVOISF.Concept.ConceptResearchAreaOfIterator theConceptResearchAreaOfIterator = (edu.uiowa.slis.VIVOISF.Concept.ConceptResearchAreaOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Concept.ConceptResearchAreaOfIterator.class);

			if (subjectURI == null && theConceptResearchAreaOfIterator != null) {
				subjectURI = theConceptResearchAreaOfIterator.getResearchAreaOf();
			}

			edu.uiowa.slis.VIVOISF.Area.AreaRO_0001015Iterator theAreaRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.Area.AreaRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Area.AreaRO_0001015Iterator.class);

			if (subjectURI == null && theAreaRO_0001015Iterator != null) {
				subjectURI = theAreaRO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.Self_governing.Self_governingRO_0001015Iterator theSelf_governingRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.Self_governing.Self_governingRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Self_governing.Self_governingRO_0001015Iterator.class);

			if (subjectURI == null && theSelf_governingRO_0001015Iterator != null) {
				subjectURI = theSelf_governingRO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.Territory.TerritoryRO_0001015Iterator theTerritoryRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.Territory.TerritoryRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Territory.TerritoryRO_0001015Iterator.class);

			if (subjectURI == null && theTerritoryRO_0001015Iterator != null) {
				subjectURI = theTerritoryRO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001015Iterator theBFO_0000001RO_0001015Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RO_0001015Iterator.class);

			if (subjectURI == null && theBFO_0000001RO_0001015Iterator != null) {
				subjectURI = theBFO_0000001RO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001015Iterator theBFO_0000002RO_0001015Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RO_0001015Iterator.class);

			if (subjectURI == null && theBFO_0000002RO_0001015Iterator != null) {
				subjectURI = theBFO_0000002RO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001015Iterator theBFO_0000004RO_0001015Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RO_0001015Iterator.class);

			if (subjectURI == null && theBFO_0000004RO_0001015Iterator != null) {
				subjectURI = theBFO_0000004RO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006RO_0001015Iterator theBFO_0000006RO_0001015Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006RO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000006.BFO_0000006RO_0001015Iterator.class);

			if (subjectURI == null && theBFO_0000006RO_0001015Iterator != null) {
				subjectURI = theBFO_0000006RO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141RO_0001015Iterator theBFO_0000141RO_0001015Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141RO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000141.BFO_0000141RO_0001015Iterator.class);

			if (subjectURI == null && theBFO_0000141RO_0001015Iterator != null) {
				subjectURI = theBFO_0000141RO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.Country.CountryRO_0001015Iterator theCountryRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.Country.CountryRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Country.CountryRO_0001015Iterator.class);

			if (subjectURI == null && theCountryRO_0001015Iterator != null) {
				subjectURI = theCountryRO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationRO_0001015Iterator theGeographicLocationRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeographicLocation.GeographicLocationRO_0001015Iterator.class);

			if (subjectURI == null && theGeographicLocationRO_0001015Iterator != null) {
				subjectURI = theGeographicLocationRO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionRO_0001015Iterator theGeographicRegionRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionRO_0001015Iterator.class);

			if (subjectURI == null && theGeographicRegionRO_0001015Iterator != null) {
				subjectURI = theGeographicRegionRO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityRO_0001015Iterator theGeopoliticalEntityRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeopoliticalEntity.GeopoliticalEntityRO_0001015Iterator.class);

			if (subjectURI == null && theGeopoliticalEntityRO_0001015Iterator != null) {
				subjectURI = theGeopoliticalEntityRO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.Location.LocationRO_0001015Iterator theLocationRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.Location.LocationRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Location.LocationRO_0001015Iterator.class);

			if (subjectURI == null && theLocationRO_0001015Iterator != null) {
				subjectURI = theLocationRO_0001015Iterator.getRO_0001015();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001015Iterator theThingRO_0001015Iterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001015Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRO_0001015Iterator.class);

			if (subjectURI == null && theThingRO_0001015Iterator != null) {
				subjectURI = theThingRO_0001015Iterator.getRO_0001015();
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

			edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionGeographicFocusOfIterator theGeographicRegionGeographicFocusOfIterator = (edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionGeographicFocusOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GeographicRegion.GeographicRegionGeographicFocusOfIterator.class);

			if (subjectURI == null && theGeographicRegionGeographicFocusOfIterator != null) {
				subjectURI = theGeographicRegionGeographicFocusOfIterator.getGeographicFocusOf();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RO_0000052Iterator theBFO_0000020RO_0000052Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RO_0000052Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RO_0000052Iterator.class);

			if (subjectURI == null && theBFO_0000020RO_0000052Iterator != null) {
				subjectURI = theBFO_0000020RO_0000052Iterator.getRO_0000052();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator theBFO_0000001RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator.class);

			if (subjectURI == null && theBFO_0000001RelatesIterator != null) {
				subjectURI = theBFO_0000001RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator theBFO_0000002RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator.class);

			if (subjectURI == null && theBFO_0000002RelatesIterator != null) {
				subjectURI = theBFO_0000002RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator theThingRelatesIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator.class);

			if (subjectURI == null && theThingRelatesIterator != null) {
				subjectURI = theThingRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator theBFO_0000020RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator.class);

			if (subjectURI == null && theBFO_0000020RelatesIterator != null) {
				subjectURI = theBFO_0000020RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator theRelationshipRelatesIterator = (edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator.class);

			if (subjectURI == null && theRelationshipRelatesIterator != null) {
				subjectURI = theRelationshipRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator theAuthorshipRelatesIterator = (edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator.class);

			if (subjectURI == null && theAuthorshipRelatesIterator != null) {
				subjectURI = theAuthorshipRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatesIterator theBFO_0000031RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatesIterator.class);

			if (subjectURI == null && theBFO_0000031RelatesIterator != null) {
				subjectURI = theBFO_0000031RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatesIterator theIAO_0000030RelatesIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatesIterator.class);

			if (subjectURI == null && theIAO_0000030RelatesIterator != null) {
				subjectURI = theIAO_0000030RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator thePositionRelatesIterator = (edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator.class);

			if (subjectURI == null && thePositionRelatesIterator != null) {
				subjectURI = thePositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatesIterator theAddressingRelatesIterator = (edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatesIterator.class);

			if (subjectURI == null && theAddressingRelatesIterator != null) {
				subjectURI = theAddressingRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatesIterator theCommunicationRelatesIterator = (edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatesIterator.class);

			if (subjectURI == null && theCommunicationRelatesIterator != null) {
				subjectURI = theCommunicationRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatesIterator theExplanatoryRelatesIterator = (edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatesIterator.class);

			if (subjectURI == null && theExplanatoryRelatesIterator != null) {
				subjectURI = theExplanatoryRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatesIterator theIdentificationRelatesIterator = (edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatesIterator.class);

			if (subjectURI == null && theIdentificationRelatesIterator != null) {
				subjectURI = theIdentificationRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Name.NameRelatesIterator theNameRelatesIterator = (edu.uiowa.slis.VIVOISF.Name.NameRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Name.NameRelatesIterator.class);

			if (subjectURI == null && theNameRelatesIterator != null) {
				subjectURI = theNameRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator theLibrarianPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator.class);

			if (subjectURI == null && theLibrarianPositionRelatesIterator != null) {
				subjectURI = theLibrarianPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator theNonAcademicPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator.class);

			if (subjectURI == null && theNonAcademicPositionRelatesIterator != null) {
				subjectURI = theNonAcademicPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator theFacultyPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator.class);

			if (subjectURI == null && theFacultyPositionRelatesIterator != null) {
				subjectURI = theFacultyPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator theEditorshipRelatesIterator = (edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator.class);

			if (subjectURI == null && theEditorshipRelatesIterator != null) {
				subjectURI = theEditorshipRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator theFacultyAdministrativePositionRelatesIterator = (edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator.class);

			if (subjectURI == null && theFacultyAdministrativePositionRelatesIterator != null) {
				subjectURI = theFacultyAdministrativePositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator theNonFacultyAcademicPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator.class);

			if (subjectURI == null && theNonFacultyAcademicPositionRelatesIterator != null) {
				subjectURI = theNonFacultyAcademicPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator theARG_2000379RelatesIterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator.class);

			if (subjectURI == null && theARG_2000379RelatesIterator != null) {
				subjectURI = theARG_2000379RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator thePrimaryPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator.class);

			if (subjectURI == null && thePrimaryPositionRelatesIterator != null) {
				subjectURI = thePrimaryPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator theKindRelatesIterator = (edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator.class);

			if (subjectURI == null && theKindRelatesIterator != null) {
				subjectURI = theKindRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator thePostdocPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator.class);

			if (subjectURI == null && thePostdocPositionRelatesIterator != null) {
				subjectURI = thePostdocPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator theURLRelatesIterator = (edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator.class);

			if (subjectURI == null && theURLRelatesIterator != null) {
				subjectURI = theURLRelatesIterator.getRelates();
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

			if (theBFO_0000004Iterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  ?Abbreviation where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#abbreviation> ?Abbreviation } "
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
					abbreviation = sol.get("?Abbreviation") == null ? null : sol.get("?Abbreviation").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in BFO_0000004 doStartTag", e);
			throw new JspTagException("Exception raised in BFO_0000004 doStartTag");
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
			log.error("Exception raised in BFO_0000004 doEndTag", e);
			throw new JspTagException("Exception raised in BFO_0000004 doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

}
