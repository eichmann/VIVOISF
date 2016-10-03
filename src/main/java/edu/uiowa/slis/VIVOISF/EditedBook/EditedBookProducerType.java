package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookProducerIterator theEditedBookProducerIterator = (EditedBookProducerIterator)findAncestorWithClass(this, EditedBookProducerIterator.class);
			pageContext.getOut().print(theEditedBookProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for producer tag ");
		}
		return SKIP_BODY;
	}
}

