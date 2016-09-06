package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteIAO_0000136Iterator theStatuteIAO_0000136Iterator = (StatuteIAO_0000136Iterator)findAncestorWithClass(this, StatuteIAO_0000136Iterator.class);
			pageContext.getOut().print(theStatuteIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

