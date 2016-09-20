package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteERO_0000045Iterator theStatute = (StatuteERO_0000045Iterator)findAncestorWithClass(this, StatuteERO_0000045Iterator.class);
			pageContext.getOut().print(theStatute.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

