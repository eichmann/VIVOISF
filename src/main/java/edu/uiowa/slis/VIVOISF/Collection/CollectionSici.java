package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionSici currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionSiciIterator theCollection = (CollectionSiciIterator)findAncestorWithClass(this, CollectionSiciIterator.class);
			pageContext.getOut().print(theCollection.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for sici tag ");
		}
		return SKIP_BODY;
	}
}

