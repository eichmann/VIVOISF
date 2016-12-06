package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonGDPTotalInCurrentPricesIterator thePerson = (PersonGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, PersonGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(thePerson.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

