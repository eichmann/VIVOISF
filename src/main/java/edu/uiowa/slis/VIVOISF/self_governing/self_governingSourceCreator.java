package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingSourceCreator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingSourceCreator currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingSourceCreator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingSourceCreatorIterator theself_governing = (self_governingSourceCreatorIterator)findAncestorWithClass(this, self_governingSourceCreatorIterator.class);
			pageContext.getOut().print(theself_governing.getSourceCreator());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for sourceCreator tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for sourceCreator tag ");
		}
		return SKIP_BODY;
	}
}

