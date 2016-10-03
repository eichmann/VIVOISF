package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationProducerInverseIterator theAssociationProducerInverseIterator = (AssociationProducerInverseIterator)findAncestorWithClass(this, AssociationProducerInverseIterator.class);
			pageContext.getOut().print(theAssociationProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for producer tag ");
		}
		return SKIP_BODY;
	}
}

