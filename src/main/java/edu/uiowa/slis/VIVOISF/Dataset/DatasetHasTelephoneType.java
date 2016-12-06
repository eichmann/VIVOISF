package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasTelephoneIterator theDatasetHasTelephoneIterator = (DatasetHasTelephoneIterator)findAncestorWithClass(this, DatasetHasTelephoneIterator.class);
			pageContext.getOut().print(theDatasetHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

