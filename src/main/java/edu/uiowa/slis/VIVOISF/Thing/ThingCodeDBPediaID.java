package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingCodeDBPediaIDIterator theThing = (ThingCodeDBPediaIDIterator)findAncestorWithClass(this, ThingCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theThing.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

