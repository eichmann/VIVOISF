package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationEanucc13Iterator theLegislation = (LegislationEanucc13Iterator)findAncestorWithClass(this, LegislationEanucc13Iterator.class);
			pageContext.getOut().print(theLegislation.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

