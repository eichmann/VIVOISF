package edu.uiowa.slis.VIVOISF.AcademicArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicArticleVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicArticleVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicArticleVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AcademicArticleVolumeIterator theAcademicArticle = (AcademicArticleVolumeIterator)findAncestorWithClass(this, AcademicArticleVolumeIterator.class);
			pageContext.getOut().print(theAcademicArticle.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicArticle for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicArticle for volume tag ");
		}
		return SKIP_BODY;
	}
}

