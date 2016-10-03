package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteEanucc13Iterator theStatute = (StatuteEanucc13Iterator)findAncestorWithClass(this, StatuteEanucc13Iterator.class);
			pageContext.getOut().print(theStatute.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

