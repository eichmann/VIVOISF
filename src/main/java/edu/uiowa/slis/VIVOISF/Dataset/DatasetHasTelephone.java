package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasTelephoneIterator theDatasetHasTelephoneIterator = (DatasetHasTelephoneIterator)findAncestorWithClass(this, DatasetHasTelephoneIterator.class);
			pageContext.getOut().print(theDatasetHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

