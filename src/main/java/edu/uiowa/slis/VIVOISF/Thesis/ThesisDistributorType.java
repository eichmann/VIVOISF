package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisDistributorIterator theThesisDistributorIterator = (ThesisDistributorIterator)findAncestorWithClass(this, ThesisDistributorIterator.class);
			pageContext.getOut().print(theThesisDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for distributor tag ");
		}
		return SKIP_BODY;
	}
}

