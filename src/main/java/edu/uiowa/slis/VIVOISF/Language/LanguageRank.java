package edu.uiowa.slis.VIVOISF.Language;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LanguageRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LanguageRank currentInstance = null;
	private static final Log log = LogFactory.getLog(LanguageRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LanguageRankIterator theLanguage = (LanguageRankIterator)findAncestorWithClass(this, LanguageRankIterator.class);
			pageContext.getOut().print(theLanguage.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Language for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Language for rank tag ");
		}
		return SKIP_BODY;
	}
}

