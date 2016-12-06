package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticle theAcademicArticle = (AcademicArticle)findAncestorWithClass(this, AcademicArticle.class);
			if (!theAcademicArticle.commitNeeded) {
				pageContext.getOut().print(theAcademicArticle.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			AcademicArticle theAcademicArticle = (AcademicArticle)findAncestorWithClass(this, AcademicArticle.class);
			return theAcademicArticle.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing AcademicArticle for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			AcademicArticle theAcademicArticle = (AcademicArticle)findAncestorWithClass(this, AcademicArticle.class);
			theAcademicArticle.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for abbreviation tag ");
		}
	}
}

