package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingARG_2000028Iterator theThingARG_2000028Iterator = (ThingARG_2000028Iterator)findAncestorWithClass(this, ThingARG_2000028Iterator.class);
			pageContext.getOut().print(theThingARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

