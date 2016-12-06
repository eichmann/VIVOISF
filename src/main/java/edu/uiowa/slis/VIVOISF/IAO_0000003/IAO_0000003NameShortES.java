package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003NameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003NameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003NameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003NameShortESIterator theIAO_0000003 = (IAO_0000003NameShortESIterator)findAncestorWithClass(this, IAO_0000003NameShortESIterator.class);
			pageContext.getOut().print(theIAO_0000003.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

