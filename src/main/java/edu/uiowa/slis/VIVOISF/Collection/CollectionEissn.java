package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionEissn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionEissn currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionEissn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionEissnIterator theCollection = (CollectionEissnIterator)findAncestorWithClass(this, CollectionEissnIterator.class);
			pageContext.getOut().print(theCollection.getEissn());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for eissn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for eissn tag ");
		}
		return SKIP_BODY;
	}
}

