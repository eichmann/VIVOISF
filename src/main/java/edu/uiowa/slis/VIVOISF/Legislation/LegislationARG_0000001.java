package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationARG_0000001Iterator theLegislation = (LegislationARG_0000001Iterator)findAncestorWithClass(this, LegislationARG_0000001Iterator.class);
			pageContext.getOut().print(theLegislation.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

