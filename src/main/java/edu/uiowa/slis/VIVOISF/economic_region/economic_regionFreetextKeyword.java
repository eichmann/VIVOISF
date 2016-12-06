package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionFreetextKeywordIterator theeconomic_region = (economic_regionFreetextKeywordIterator)findAncestorWithClass(this, economic_regionFreetextKeywordIterator.class);
			pageContext.getOut().print(theeconomic_region.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

