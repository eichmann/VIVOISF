package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationERO_0000045Iterator theLegislation = (LegislationERO_0000045Iterator)findAncestorWithClass(this, LegislationERO_0000045Iterator.class);
			pageContext.getOut().print(theLegislation.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

