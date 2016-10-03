package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefEanucc13Iterator theBrief = (BriefEanucc13Iterator)findAncestorWithClass(this, BriefEanucc13Iterator.class);
			pageContext.getOut().print(theBrief.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}
