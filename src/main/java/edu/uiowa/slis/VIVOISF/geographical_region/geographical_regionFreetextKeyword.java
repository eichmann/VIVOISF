package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionFreetextKeywordIterator thegeographical_region = (geographical_regionFreetextKeywordIterator)findAncestorWithClass(this, geographical_regionFreetextKeywordIterator.class);
			pageContext.getOut().print(thegeographical_region.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

