package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeDistributorIterator theCodeDistributorIterator = (CodeDistributorIterator)findAncestorWithClass(this, CodeDistributorIterator.class);
			pageContext.getOut().print(theCodeDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for distributor tag ");
		}
		return SKIP_BODY;
	}
}

