package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefERO_0000045Iterator theBrief = (BriefERO_0000045Iterator)findAncestorWithClass(this, BriefERO_0000045Iterator.class);
			pageContext.getOut().print(theBrief.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

