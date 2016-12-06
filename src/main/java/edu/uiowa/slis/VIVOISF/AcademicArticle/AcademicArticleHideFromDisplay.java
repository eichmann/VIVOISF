package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticle theAcademicArticle = (AcademicArticle)findAncestorWithClass(this, AcademicArticle.class);
			if (!theAcademicArticle.commitNeeded) {
				pageContext.getOut().print(theAcademicArticle.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			AcademicArticle theAcademicArticle = (AcademicArticle)findAncestorWithClass(this, AcademicArticle.class);
			return theAcademicArticle.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing AcademicArticle for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			AcademicArticle theAcademicArticle = (AcademicArticle)findAncestorWithClass(this, AcademicArticle.class);
			theAcademicArticle.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for hideFromDisplay tag ");
		}
	}
}

