package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticlePlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticlePlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticlePlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticle theAcademicArticle = (AcademicArticle)findAncestorWithClass(this, AcademicArticle.class);
			if (!theAcademicArticle.commitNeeded) {
				pageContext.getOut().print(theAcademicArticle.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			AcademicArticle theAcademicArticle = (AcademicArticle)findAncestorWithClass(this, AcademicArticle.class);
			return theAcademicArticle.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing AcademicArticle for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			AcademicArticle theAcademicArticle = (AcademicArticle)findAncestorWithClass(this, AcademicArticle.class);
			theAcademicArticle.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for placeOfPublication tag ");
		}
	}
}

