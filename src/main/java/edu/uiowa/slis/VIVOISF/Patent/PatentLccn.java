package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentLccnIterator thePatent = (PatentLccnIterator)findAncestorWithClass(this, PatentLccnIterator.class);
			pageContext.getOut().print(thePatent.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for lccn tag ");
		}
		return SKIP_BODY;
	}
}

