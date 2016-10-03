package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentSici currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentSiciIterator thePatent = (PatentSiciIterator)findAncestorWithClass(this, PatentSiciIterator.class);
			pageContext.getOut().print(thePatent.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for sici tag ");
		}
		return SKIP_BODY;
	}
}

