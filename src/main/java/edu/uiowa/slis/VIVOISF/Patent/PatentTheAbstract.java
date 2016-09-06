package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentTheAbstractIterator thePatent = (PatentTheAbstractIterator)findAncestorWithClass(this, PatentTheAbstractIterator.class);
			pageContext.getOut().print(thePatent.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

