package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ARG_2000379 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379 currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ARG_2000379Iterator theARG_2000379Iterator = (ARG_2000379Iterator) findAncestorWithClass(this, ARG_2000379Iterator.class);

			if (theARG_2000379Iterator != null) {
				subjectURI = theARG_2000379Iterator.getSubjectURI();
				label = theARG_2000379Iterator.getLabel();
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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator)this.getParent()).getRelatedBy();
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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001ARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001ARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002ARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002ARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031ARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031ARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030ARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030ARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Article.ArticleARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Article.ArticleARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004ARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004ARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Agent.AgentARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Agent.AgentARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Dataset.DatasetARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Dataset.DatasetARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BookSection.BookSectionARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BookSection.BookSectionARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Slideshow.SlideshowARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Slideshow.SlideshowARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Book.BookARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Book.BookARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Collection.CollectionARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Collection.CollectionARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003ARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003ARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015ARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015ARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Event.EventARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Event.EventARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Conference.ConferenceARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Conference.ConferenceARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Report.ReportARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Report.ReportARG_2000028Iterator)this.getParent()).getARG_2000028();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentARG_2000028Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentARG_2000028Iterator)this.getParent()).getARG_2000028();
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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Article.ArticleRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Article.ArticleRelatesIterator)this.getParent()).getRelates();
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

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.URL.URLHasURLInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.URL.URLHasURLInverseIterator)this.getParent()).getHasURLInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Name.NameHasNameInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Name.NameHasNameInverseIterator)this.getParent()).getHasNameInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Telephone.TelephoneHasTelephoneInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Telephone.TelephoneHasTelephoneInverseIterator)this.getParent()).getHasTelephoneInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Email.EmailHasEmailInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Email.EmailHasEmailInverseIterator)this.getParent()).getHasEmailInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Title.TitleHasTitleInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Title.TitleHasTitleInverseIterator)this.getParent()).getHasTitleInverse();
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

			edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator theConferencePaperRelatedByIterator = (edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperRelatedByIterator.class);

			if (subjectURI == null && theConferencePaperRelatedByIterator != null) {
				subjectURI = theConferencePaperRelatedByIterator.getRelatedBy();
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

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001ARG_2000028Iterator theBFO_0000001ARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001ARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001ARG_2000028Iterator.class);

			if (subjectURI == null && theBFO_0000001ARG_2000028Iterator != null) {
				subjectURI = theBFO_0000001ARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingARG_2000028Iterator theThingARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Thing.ThingARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingARG_2000028Iterator.class);

			if (subjectURI == null && theThingARG_2000028Iterator != null) {
				subjectURI = theThingARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002ARG_2000028Iterator theBFO_0000002ARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002ARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002ARG_2000028Iterator.class);

			if (subjectURI == null && theBFO_0000002ARG_2000028Iterator != null) {
				subjectURI = theBFO_0000002ARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031ARG_2000028Iterator theBFO_0000031ARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031ARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031ARG_2000028Iterator.class);

			if (subjectURI == null && theBFO_0000031ARG_2000028Iterator != null) {
				subjectURI = theBFO_0000031ARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030ARG_2000028Iterator theIAO_0000030ARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030ARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030ARG_2000028Iterator.class);

			if (subjectURI == null && theIAO_0000030ARG_2000028Iterator != null) {
				subjectURI = theIAO_0000030ARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentARG_2000028Iterator theDocumentARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Document.DocumentARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentARG_2000028Iterator.class);

			if (subjectURI == null && theDocumentARG_2000028Iterator != null) {
				subjectURI = theDocumentARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Article.ArticleARG_2000028Iterator theArticleARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Article.ArticleARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Article.ArticleARG_2000028Iterator.class);

			if (subjectURI == null && theArticleARG_2000028Iterator != null) {
				subjectURI = theArticleARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleARG_2000028Iterator theAcademicArticleARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleARG_2000028Iterator.class);

			if (subjectURI == null && theAcademicArticleARG_2000028Iterator != null) {
				subjectURI = theAcademicArticleARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004ARG_2000028Iterator theBFO_0000004ARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004ARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004ARG_2000028Iterator.class);

			if (subjectURI == null && theBFO_0000004ARG_2000028Iterator != null) {
				subjectURI = theBFO_0000004ARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Agent.AgentARG_2000028Iterator theAgentARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Agent.AgentARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Agent.AgentARG_2000028Iterator.class);

			if (subjectURI == null && theAgentARG_2000028Iterator != null) {
				subjectURI = theAgentARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonARG_2000028Iterator thePersonARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Person.PersonARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonARG_2000028Iterator.class);

			if (subjectURI == null && thePersonARG_2000028Iterator != null) {
				subjectURI = thePersonARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Dataset.DatasetARG_2000028Iterator theDatasetARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Dataset.DatasetARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Dataset.DatasetARG_2000028Iterator.class);

			if (subjectURI == null && theDatasetARG_2000028Iterator != null) {
				subjectURI = theDatasetARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperARG_2000028Iterator theConferencePaperARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePaper.ConferencePaperARG_2000028Iterator.class);

			if (subjectURI == null && theConferencePaperARG_2000028Iterator != null) {
				subjectURI = theConferencePaperARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.BookSection.BookSectionARG_2000028Iterator theBookSectionARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.BookSection.BookSectionARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BookSection.BookSectionARG_2000028Iterator.class);

			if (subjectURI == null && theBookSectionARG_2000028Iterator != null) {
				subjectURI = theBookSectionARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterARG_2000028Iterator theChapterARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterARG_2000028Iterator.class);

			if (subjectURI == null && theChapterARG_2000028Iterator != null) {
				subjectURI = theChapterARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartARG_2000028Iterator theDocumentPartARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartARG_2000028Iterator.class);

			if (subjectURI == null && theDocumentPartARG_2000028Iterator != null) {
				subjectURI = theDocumentPartARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Slideshow.SlideshowARG_2000028Iterator theSlideshowARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Slideshow.SlideshowARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Slideshow.SlideshowARG_2000028Iterator.class);

			if (subjectURI == null && theSlideshowARG_2000028Iterator != null) {
				subjectURI = theSlideshowARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterARG_2000028Iterator theConferencePosterARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ConferencePoster.ConferencePosterARG_2000028Iterator.class);

			if (subjectURI == null && theConferencePosterARG_2000028Iterator != null) {
				subjectURI = theConferencePosterARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Book.BookARG_2000028Iterator theBookARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Book.BookARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Book.BookARG_2000028Iterator.class);

			if (subjectURI == null && theBookARG_2000028Iterator != null) {
				subjectURI = theBookARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Collection.CollectionARG_2000028Iterator theCollectionARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Collection.CollectionARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Collection.CollectionARG_2000028Iterator.class);

			if (subjectURI == null && theCollectionARG_2000028Iterator != null) {
				subjectURI = theCollectionARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003ARG_2000028Iterator theBFO_0000003ARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003ARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000003.BFO_0000003ARG_2000028Iterator.class);

			if (subjectURI == null && theBFO_0000003ARG_2000028Iterator != null) {
				subjectURI = theBFO_0000003ARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015ARG_2000028Iterator theBFO_0000015ARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015ARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000015.BFO_0000015ARG_2000028Iterator.class);

			if (subjectURI == null && theBFO_0000015ARG_2000028Iterator != null) {
				subjectURI = theBFO_0000015ARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Event.EventARG_2000028Iterator theEventARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Event.EventARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Event.EventARG_2000028Iterator.class);

			if (subjectURI == null && theEventARG_2000028Iterator != null) {
				subjectURI = theEventARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Conference.ConferenceARG_2000028Iterator theConferenceARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Conference.ConferenceARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Conference.ConferenceARG_2000028Iterator.class);

			if (subjectURI == null && theConferenceARG_2000028Iterator != null) {
				subjectURI = theConferenceARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.Report.ReportARG_2000028Iterator theReportARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.Report.ReportARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Report.ReportARG_2000028Iterator.class);

			if (subjectURI == null && theReportARG_2000028Iterator != null) {
				subjectURI = theReportARG_2000028Iterator.getARG_2000028();
			}

			edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentARG_2000028Iterator theAudioVisualDocumentARG_2000028Iterator = (edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentARG_2000028Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AudioVisualDocument.AudioVisualDocumentARG_2000028Iterator.class);

			if (subjectURI == null && theAudioVisualDocumentARG_2000028Iterator != null) {
				subjectURI = theAudioVisualDocumentARG_2000028Iterator.getARG_2000028();
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

			edu.uiowa.slis.VIVOISF.Document.DocumentRelatesIterator theDocumentRelatesIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentRelatesIterator.class);

			if (subjectURI == null && theDocumentRelatesIterator != null) {
				subjectURI = theDocumentRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Article.ArticleRelatesIterator theArticleRelatesIterator = (edu.uiowa.slis.VIVOISF.Article.ArticleRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Article.ArticleRelatesIterator.class);

			if (subjectURI == null && theArticleRelatesIterator != null) {
				subjectURI = theArticleRelatesIterator.getRelates();
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

			edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatesIterator theBFO_0000017RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000017.BFO_0000017RelatesIterator.class);

			if (subjectURI == null && theBFO_0000017RelatesIterator != null) {
				subjectURI = theBFO_0000017RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatesIterator theBFO_0000023RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000023.BFO_0000023RelatesIterator.class);

			if (subjectURI == null && theBFO_0000023RelatesIterator != null) {
				subjectURI = theBFO_0000023RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator theARG_2000379RelatesIterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379RelatesIterator.class);

			if (subjectURI == null && theARG_2000379RelatesIterator != null) {
				subjectURI = theARG_2000379RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator theKindRelatesIterator = (edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Kind.KindRelatesIterator.class);

			if (subjectURI == null && theKindRelatesIterator != null) {
				subjectURI = theKindRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator theURLRelatesIterator = (edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.URL.URLRelatesIterator.class);

			if (subjectURI == null && theURLRelatesIterator != null) {
				subjectURI = theURLRelatesIterator.getRelates();
			}

			if (theARG_2000379Iterator == null && subjectURI == null) {
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
			log.error("Exception raised in ARG_2000379 doStartTag", e);
			throw new JspTagException("Exception raised in ARG_2000379 doStartTag");
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
			log.error("Exception raised in ARG_2000379 doEndTag", e);
			throw new JspTagException("Exception raised in ARG_2000379 doEndTag");
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
