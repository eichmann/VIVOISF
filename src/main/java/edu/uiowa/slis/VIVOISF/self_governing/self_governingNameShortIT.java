package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameShortITIterator theself_governing = (self_governingNameShortITIterator)findAncestorWithClass(this, self_governingNameShortITIterator.class);
			pageContext.getOut().print(theself_governing.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

