package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentARG_0000001Iterator thePatent = (PatentARG_0000001Iterator)findAncestorWithClass(this, PatentARG_0000001Iterator.class);
			pageContext.getOut().print(thePatent.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

