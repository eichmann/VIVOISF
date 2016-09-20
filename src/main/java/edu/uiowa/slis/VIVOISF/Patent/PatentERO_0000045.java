package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentERO_0000045Iterator thePatent = (PatentERO_0000045Iterator)findAncestorWithClass(this, PatentERO_0000045Iterator.class);
			pageContext.getOut().print(thePatent.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

