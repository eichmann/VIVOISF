package edu.uiowa.slis.VIVOISF.ERO_0000394;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000394Doi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000394Doi currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000394Doi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ERO_0000394DoiIterator theERO_0000394 = (ERO_0000394DoiIterator)findAncestorWithClass(this, ERO_0000394DoiIterator.class);
			pageContext.getOut().print(theERO_0000394.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000394 for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000394 for doi tag ");
		}
		return SKIP_BODY;
	}
}

