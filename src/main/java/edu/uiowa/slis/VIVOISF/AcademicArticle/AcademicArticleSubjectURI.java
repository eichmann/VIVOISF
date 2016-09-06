package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticle theAcademicArticle = (AcademicArticle)findAncestorWithClass(this, AcademicArticle.class);
			if (!theAcademicArticle.commitNeeded) {
				pageContext.getOut().print(theAcademicArticle.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AcademicArticle theAcademicArticle = (AcademicArticle)findAncestorWithClass(this, AcademicArticle.class);
			return theAcademicArticle.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AcademicArticle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AcademicArticle theAcademicArticle = (AcademicArticle)findAncestorWithClass(this, AcademicArticle.class);
			theAcademicArticle.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for subjectURI tag ");
		}
	}
}

