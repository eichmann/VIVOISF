package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentPublisherIterator theContinentPublisherIterator = (ContinentPublisherIterator)findAncestorWithClass(this, ContinentPublisherIterator.class);
			pageContext.getOut().print(theContinentPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for publisher tag ");
		}
		return SKIP_BODY;
	}
}

