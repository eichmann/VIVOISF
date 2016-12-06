package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionCodeDBPediaIDIterator theeconomic_region = (economic_regionCodeDBPediaIDIterator)findAncestorWithClass(this, economic_regionCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theeconomic_region.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

