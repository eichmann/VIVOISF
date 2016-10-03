package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentEanucc13Iterator thePatent = (PatentEanucc13Iterator)findAncestorWithClass(this, PatentEanucc13Iterator.class);
			pageContext.getOut().print(thePatent.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

