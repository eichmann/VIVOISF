package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteARG_0000001Iterator theStatute = (StatuteARG_0000001Iterator)findAncestorWithClass(this, StatuteARG_0000001Iterator.class);
			pageContext.getOut().print(theStatute.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

