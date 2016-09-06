package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticle theAcademicArticle = (AcademicArticle)findAncestorWithClass(this, AcademicArticle.class);
			if (!theAcademicArticle.commitNeeded) {
				pageContext.getOut().print(theAcademicArticle.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AcademicArticle theAcademicArticle = (AcademicArticle)findAncestorWithClass(this, AcademicArticle.class);
			return theAcademicArticle.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AcademicArticle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AcademicArticle theAcademicArticle = (AcademicArticle)findAncestorWithClass(this, AcademicArticle.class);
			theAcademicArticle.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for label tag ");
		}
	}
}

