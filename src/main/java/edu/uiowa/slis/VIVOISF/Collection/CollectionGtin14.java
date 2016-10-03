package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionGtin14Iterator theCollection = (CollectionGtin14Iterator)findAncestorWithClass(this, CollectionGtin14Iterator.class);
			pageContext.getOut().print(theCollection.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

