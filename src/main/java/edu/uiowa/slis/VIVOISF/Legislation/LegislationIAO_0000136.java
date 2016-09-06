package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegislationIAO_0000136Iterator theLegislationIAO_0000136Iterator = (LegislationIAO_0000136Iterator)findAncestorWithClass(this, LegislationIAO_0000136Iterator.class);
			pageContext.getOut().print(theLegislationIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

