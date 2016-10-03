package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionEanucc13Iterator theCollection = (CollectionEanucc13Iterator)findAncestorWithClass(this, CollectionEanucc13Iterator.class);
			pageContext.getOut().print(theCollection.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

