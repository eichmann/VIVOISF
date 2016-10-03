package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionIssn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionIssn currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionIssn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionIssnIterator theCollection = (CollectionIssnIterator)findAncestorWithClass(this, CollectionIssnIterator.class);
			pageContext.getOut().print(theCollection.getIssn());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for issn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for issn tag ");
		}
		return SKIP_BODY;
	}
}

