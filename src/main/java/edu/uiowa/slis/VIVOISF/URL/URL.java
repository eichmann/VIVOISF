package edu.uiowa.slis.VIVOISF.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class URL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static URL currentInstance = null;
	private static final Log log = LogFactory.getLog(URL.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			URLIterator theURLIterator = (URLIterator) findAncestorWithClass(this, URLIterator.class);

			if (theURLIterator != null) {
				subjectURI = theURLIterator.getSubjectURI();
				label = theURLIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Kind.KindRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Kind.KindRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Agent.AgentRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Agent.AgentRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BookSection.BookSectionRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BookSection.BookSectionRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Organization.OrganizationRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Organization.OrganizationRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Collection.CollectionRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Collection.CollectionRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Company.CompanyRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Company.CompanyRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Name.NameRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Name.NameRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.GovernmentAgency.GovernmentAgencyRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.GovernmentAgency.GovernmentAgencyRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Publisher.PublisherRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Publisher.PublisherRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingHasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingHasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Kind.KindHasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Kind.KindHasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Addressing.AddressingHasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Addressing.AddressingHasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Communication.CommunicationHasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Communication.CommunicationHasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryHasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryHasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Identification.IdentificationHasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Identification.IdentificationHasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Individual.IndividualHasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Individual.IndividualHasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020HasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020HasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Name.NameHasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Name.NameHasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Authorship.AuthorshipHasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Authorship.AuthorshipHasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Relationship.RelationshipHasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Relationship.RelationshipHasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017HasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017HasURLIterator)this.getParent()).getHasURL();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023HasURLIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023HasURLIterator)this.getParent()).getHasURL();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator theBFO_0000001RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000001RelatedByIterator != null) {
				subjectURI = theBFO_0000001RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator theBFO_0000002RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000002RelatedByIterator != null) {
				subjectURI = theBFO_0000002RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator theThingRelatedByIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator.class);

			if (subjectURI == null && theThingRelatedByIterator != null) {
				subjectURI = theThingRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatedByIterator theBFO_0000031RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000031RelatedByIterator != null) {
				subjectURI = theBFO_0000031RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatedByIterator theIAO_0000030RelatedByIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatedByIterator.class);

			if (subjectURI == null && theIAO_0000030RelatedByIterator != null) {
				subjectURI = theIAO_0000030RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentRelatedByIterator theDocumentRelatedByIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentRelatedByIterator.class);

			if (subjectURI == null && theDocumentRelatedByIterator != null) {
				subjectURI = theDocumentRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator theArticleRelatedByIterator = (edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator.class);

			if (subjectURI == null && theArticleRelatedByIterator != null) {
				subjectURI = theArticleRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator theIndividualRelatedByIterator = (edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Individual.IndividualRelatedByIterator.class);

			if (subjectURI == null && theIndividualRelatedByIterator != null) {
				subjectURI = theIndividualRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatedByIterator theARG_2000379RelatedByIterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatedByIterator.class);

			if (subjectURI == null && theARG_2000379RelatedByIterator != null) {
				subjectURI = theARG_2000379RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Kind.KindRelatedByIterator theKindRelatedByIterator = (edu.uiowa.slis.VIVOISF.Kind.KindRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Kind.KindRelatedByIterator.class);

			if (subjectURI == null && theKindRelatedByIterator != null) {
				subjectURI = theKindRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator theAcademicArticleRelatedByIterator = (edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator.class);

			if (subjectURI == null && theAcademicArticleRelatedByIterator != null) {
				subjectURI = theAcademicArticleRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RelatedByIterator theBFO_0000004RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000004RelatedByIterator != null) {
				subjectURI = theBFO_0000004RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Agent.AgentRelatedByIterator theAgentRelatedByIterator = (edu.uiowa.slis.VIVOISF.Agent.AgentRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Agent.AgentRelatedByIterator.class);

			if (subjectURI == null && theAgentRelatedByIterator != null) {
				subjectURI = theAgentRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator thePersonRelatedByIterator = (edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator.class);

			if (subjectURI == null && thePersonRelatedByIterator != null) {
				subjectURI = thePersonRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatedByIterator theBFO_0000017RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000017RelatedByIterator != null) {
				subjectURI = theBFO_0000017RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatedByIterator theBFO_0000020RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000020RelatedByIterator != null) {
				subjectURI = theBFO_0000020RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatedByIterator theBFO_0000023RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000023RelatedByIterator != null) {
				subjectURI = theBFO_0000023RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator theConferencePaperRelatedByIterator = (edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator.class);

			if (subjectURI == null && theConferencePaperRelatedByIterator != null) {
				subjectURI = theConferencePaperRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator theDatasetRelatedByIterator = (edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Dataset.DatasetRelatedByIterator.class);

			if (subjectURI == null && theDatasetRelatedByIterator != null) {
				subjectURI = theDatasetRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BookSection.BookSectionRelatedByIterator theBookSectionRelatedByIterator = (edu.uiowa.slis.VIVOISF.BookSection.BookSectionRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BookSection.BookSectionRelatedByIterator.class);

			if (subjectURI == null && theBookSectionRelatedByIterator != null) {
				subjectURI = theBookSectionRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator theChapterRelatedByIterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatedByIterator.class);

			if (subjectURI == null && theChapterRelatedByIterator != null) {
				subjectURI = theChapterRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartRelatedByIterator theDocumentPartRelatedByIterator = (edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartRelatedByIterator.class);

			if (subjectURI == null && theDocumentPartRelatedByIterator != null) {
				subjectURI = theDocumentPartRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator theConferencePosterRelatedByIterator = (edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterRelatedByIterator.class);

			if (subjectURI == null && theConferencePosterRelatedByIterator != null) {
				subjectURI = theConferencePosterRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator theSlideshowRelatedByIterator = (edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Slideshow.SlideshowRelatedByIterator.class);

			if (subjectURI == null && theSlideshowRelatedByIterator != null) {
				subjectURI = theSlideshowRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Organization.OrganizationRelatedByIterator theOrganizationRelatedByIterator = (edu.uiowa.slis.VIVOISF.Organization.OrganizationRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Organization.OrganizationRelatedByIterator.class);

			if (subjectURI == null && theOrganizationRelatedByIterator != null) {
				subjectURI = theOrganizationRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator theReportRelatedByIterator = (edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Report.ReportRelatedByIterator.class);

			if (subjectURI == null && theReportRelatedByIterator != null) {
				subjectURI = theReportRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator theBookRelatedByIterator = (edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator.class);

			if (subjectURI == null && theBookRelatedByIterator != null) {
				subjectURI = theBookRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Collection.CollectionRelatedByIterator theCollectionRelatedByIterator = (edu.uiowa.slis.VIVOISF.Collection.CollectionRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Collection.CollectionRelatedByIterator.class);

			if (subjectURI == null && theCollectionRelatedByIterator != null) {
				subjectURI = theCollectionRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Company.CompanyRelatedByIterator theCompanyRelatedByIterator = (edu.uiowa.slis.VIVOISF.Company.CompanyRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Company.CompanyRelatedByIterator.class);

			if (subjectURI == null && theCompanyRelatedByIterator != null) {
				subjectURI = theCompanyRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatedByIterator theAddressingRelatedByIterator = (edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Addressing.AddressingRelatedByIterator.class);

			if (subjectURI == null && theAddressingRelatedByIterator != null) {
				subjectURI = theAddressingRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatedByIterator theCommunicationRelatedByIterator = (edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Communication.CommunicationRelatedByIterator.class);

			if (subjectURI == null && theCommunicationRelatedByIterator != null) {
				subjectURI = theCommunicationRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatedByIterator theExplanatoryRelatedByIterator = (edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryRelatedByIterator.class);

			if (subjectURI == null && theExplanatoryRelatedByIterator != null) {
				subjectURI = theExplanatoryRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatedByIterator theIdentificationRelatedByIterator = (edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Identification.IdentificationRelatedByIterator.class);

			if (subjectURI == null && theIdentificationRelatedByIterator != null) {
				subjectURI = theIdentificationRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Name.NameRelatedByIterator theNameRelatedByIterator = (edu.uiowa.slis.VIVOISF.Name.NameRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Name.NameRelatedByIterator.class);

			if (subjectURI == null && theNameRelatedByIterator != null) {
				subjectURI = theNameRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator theAudioVisualDocumentRelatedByIterator = (edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentRelatedByIterator.class);

			if (subjectURI == null && theAudioVisualDocumentRelatedByIterator != null) {
				subjectURI = theAudioVisualDocumentRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatedByIterator theAuthorshipRelatedByIterator = (edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatedByIterator.class);

			if (subjectURI == null && theAuthorshipRelatedByIterator != null) {
				subjectURI = theAuthorshipRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.GovernmentAgency.GovernmentAgencyRelatedByIterator theGovernmentAgencyRelatedByIterator = (edu.uiowa.slis.VIVOISF.GovernmentAgency.GovernmentAgencyRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.GovernmentAgency.GovernmentAgencyRelatedByIterator.class);

			if (subjectURI == null && theGovernmentAgencyRelatedByIterator != null) {
				subjectURI = theGovernmentAgencyRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatedByIterator theRelationshipRelatedByIterator = (edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatedByIterator.class);

			if (subjectURI == null && theRelationshipRelatedByIterator != null) {
				subjectURI = theRelationshipRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Publisher.PublisherRelatedByIterator thePublisherRelatedByIterator = (edu.uiowa.slis.VIVOISF.Publisher.PublisherRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Publisher.PublisherRelatedByIterator.class);

			if (subjectURI == null && thePublisherRelatedByIterator != null) {
				subjectURI = thePublisherRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasURLIterator theARG_2000379HasURLIterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379HasURLIterator.class);

			if (subjectURI == null && theARG_2000379HasURLIterator != null) {
				subjectURI = theARG_2000379HasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasURLIterator theBFO_0000001HasURLIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001HasURLIterator.class);

			if (subjectURI == null && theBFO_0000001HasURLIterator != null) {
				subjectURI = theBFO_0000001HasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasURLIterator theBFO_0000002HasURLIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002HasURLIterator.class);

			if (subjectURI == null && theBFO_0000002HasURLIterator != null) {
				subjectURI = theBFO_0000002HasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasURLIterator theBFO_0000031HasURLIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031HasURLIterator.class);

			if (subjectURI == null && theBFO_0000031HasURLIterator != null) {
				subjectURI = theBFO_0000031HasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasURLIterator theIAO_0000030HasURLIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030HasURLIterator.class);

			if (subjectURI == null && theIAO_0000030HasURLIterator != null) {
				subjectURI = theIAO_0000030HasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingHasURLIterator theThingHasURLIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingHasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingHasURLIterator.class);

			if (subjectURI == null && theThingHasURLIterator != null) {
				subjectURI = theThingHasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.Kind.KindHasURLIterator theKindHasURLIterator = (edu.uiowa.slis.VIVOISF.Kind.KindHasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Kind.KindHasURLIterator.class);

			if (subjectURI == null && theKindHasURLIterator != null) {
				subjectURI = theKindHasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.Addressing.AddressingHasURLIterator theAddressingHasURLIterator = (edu.uiowa.slis.VIVOISF.Addressing.AddressingHasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Addressing.AddressingHasURLIterator.class);

			if (subjectURI == null && theAddressingHasURLIterator != null) {
				subjectURI = theAddressingHasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.Communication.CommunicationHasURLIterator theCommunicationHasURLIterator = (edu.uiowa.slis.VIVOISF.Communication.CommunicationHasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Communication.CommunicationHasURLIterator.class);

			if (subjectURI == null && theCommunicationHasURLIterator != null) {
				subjectURI = theCommunicationHasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryHasURLIterator theExplanatoryHasURLIterator = (edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryHasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Explanatory.ExplanatoryHasURLIterator.class);

			if (subjectURI == null && theExplanatoryHasURLIterator != null) {
				subjectURI = theExplanatoryHasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.Identification.IdentificationHasURLIterator theIdentificationHasURLIterator = (edu.uiowa.slis.VIVOISF.Identification.IdentificationHasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Identification.IdentificationHasURLIterator.class);

			if (subjectURI == null && theIdentificationHasURLIterator != null) {
				subjectURI = theIdentificationHasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasURLIterator theGeographicalHasURLIterator = (edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Geographical.GeographicalHasURLIterator.class);

			if (subjectURI == null && theGeographicalHasURLIterator != null) {
				subjectURI = theGeographicalHasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.Individual.IndividualHasURLIterator theIndividualHasURLIterator = (edu.uiowa.slis.VIVOISF.Individual.IndividualHasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Individual.IndividualHasURLIterator.class);

			if (subjectURI == null && theIndividualHasURLIterator != null) {
				subjectURI = theIndividualHasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020HasURLIterator theBFO_0000020HasURLIterator = (edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020HasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020HasURLIterator.class);

			if (subjectURI == null && theBFO_0000020HasURLIterator != null) {
				subjectURI = theBFO_0000020HasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.Name.NameHasURLIterator theNameHasURLIterator = (edu.uiowa.slis.VIVOISF.Name.NameHasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Name.NameHasURLIterator.class);

			if (subjectURI == null && theNameHasURLIterator != null) {
				subjectURI = theNameHasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.Authorship.AuthorshipHasURLIterator theAuthorshipHasURLIterator = (edu.uiowa.slis.VIVOISF.Authorship.AuthorshipHasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Authorship.AuthorshipHasURLIterator.class);

			if (subjectURI == null && theAuthorshipHasURLIterator != null) {
				subjectURI = theAuthorshipHasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.Relationship.RelationshipHasURLIterator theRelationshipHasURLIterator = (edu.uiowa.slis.VIVOISF.Relationship.RelationshipHasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Relationship.RelationshipHasURLIterator.class);

			if (subjectURI == null && theRelationshipHasURLIterator != null) {
				subjectURI = theRelationshipHasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017HasURLIterator theBFO_0000017HasURLIterator = (edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017HasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017HasURLIterator.class);

			if (subjectURI == null && theBFO_0000017HasURLIterator != null) {
				subjectURI = theBFO_0000017HasURLIterator.getHasURL();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023HasURLIterator theBFO_0000023HasURLIterator = (edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023HasURLIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023HasURLIterator.class);

			if (subjectURI == null && theBFO_0000023HasURLIterator != null) {
				subjectURI = theBFO_0000023HasURLIterator.getHasURL();
			}

			if (theURLIterator == null && subjectURI == null) {
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
			log.error("Exception raised in URL doStartTag", e);
			throw new JspTagException("Exception raised in URL doStartTag");
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
			log.error("Exception raised in URL doEndTag", e);
			throw new JspTagException("Exception raised in URL doEndTag");
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

}
