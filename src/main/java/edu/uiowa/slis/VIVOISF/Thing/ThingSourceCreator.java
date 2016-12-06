package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingSourceCreator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingSourceCreator currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingSourceCreator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingSourceCreatorIterator theThing = (ThingSourceCreatorIterator)findAncestorWithClass(this, ThingSourceCreatorIterator.class);
			pageContext.getOut().print(theThing.getSourceCreator());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for sourceCreator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for sourceCreator tag ");
		}
		return SKIP_BODY;
	}
}

