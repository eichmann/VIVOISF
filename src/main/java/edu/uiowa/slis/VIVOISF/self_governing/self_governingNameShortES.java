package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameShortESIterator theself_governing = (self_governingNameShortESIterator)findAncestorWithClass(this, self_governingNameShortESIterator.class);
			pageContext.getOut().print(theself_governing.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

