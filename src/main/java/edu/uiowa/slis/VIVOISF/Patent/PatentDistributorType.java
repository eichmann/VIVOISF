package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PatentDistributorIterator thePatentDistributorIterator = (PatentDistributorIterator)findAncestorWithClass(this, PatentDistributorIterator.class);
			pageContext.getOut().print(thePatentDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for distributor tag ");
		}
		return SKIP_BODY;
	}
}

