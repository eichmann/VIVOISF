package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingFreetextKeywordIterator theThing = (ThingFreetextKeywordIterator)findAncestorWithClass(this, ThingFreetextKeywordIterator.class);
			pageContext.getOut().print(theThing.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

