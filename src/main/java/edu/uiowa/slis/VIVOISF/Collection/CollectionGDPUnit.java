package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionGDPUnitIterator theCollection = (CollectionGDPUnitIterator)findAncestorWithClass(this, CollectionGDPUnitIterator.class);
			pageContext.getOut().print(theCollection.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

